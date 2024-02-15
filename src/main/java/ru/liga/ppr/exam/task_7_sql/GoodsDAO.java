package ru.liga.ppr.exam.task_7_sql;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class GoodsDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getComputerWithFrequencyMoreThen(int frequency) {
			return jdbcTemplate.queryForRowSet(
					"""
							SELECT DISTINCT g.producer
							                      FROM Goods g
							                      INNER JOIN Computer c ON g.model = c.model
							                      WHERE g.type = 'Computer' AND c.frequency >= :frequency ORDER BY g.producer DESC""", Map.of("frequency", frequency));
	}

}
