package ru.liga.ppr.exam.task_8_sql;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProducerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getProducerAndStatsHavingMoreThen3Models(int minModels) {
			return jdbcTemplate.queryForRowSet(
					"""
							SELECT g.producer as "producer", count(g.model) as "count"
							FROM Goods g
							where g.type = 'Computer'
							GROUP BY g.producer
							HAVING g.count >= :minModels
							ORDER BY producer DESC
							""", Map.of("minModels", minModels));
	}

}
