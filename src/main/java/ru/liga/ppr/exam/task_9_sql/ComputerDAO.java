package ru.liga.ppr.exam.task_9_sql;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ComputerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getMFUProducers(String type) {
		return jdbcTemplate.queryForRowSet(
				"""
                         SELECT g.producer
                           FROM Goods g
                        JOIN Computer c ON g.model = c.model
                           WHERE g.type = 'Computer' AND c.price = (SELECT MIN(price) FROM Computer)
                           AND EXISTS (SELECT g1.producer FROM Goods g1 WHERE g1.type = :type)
                           ORDER BY c.frequency DESC
                           LIMIT 1
                        """, Map.of("type", type));
	}

}
