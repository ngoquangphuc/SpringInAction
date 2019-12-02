package com.phuc.taco_cloud.data;

import com.phuc.taco_cloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
