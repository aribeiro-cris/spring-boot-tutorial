package dev.andreiaribeiro.runnerz.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer> {

    List<Run> fundAllByLocation(String location);
}
