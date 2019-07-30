package server;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import server.model.Person;
import server.model.PersonRepository;

@Controller("/people")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Get("/")
    public Iterable<Person> index() {
        return personRepository.findAll();
    }

    @Post("/")
    public Person create(String firstName, String lastName) {
        return personRepository.save(new Person(firstName, lastName));
    }

    @Delete("/{id}")
    public HttpStatus delete(long id) {
        personRepository.deleteById(id);
        return HttpStatus.NO_CONTENT;
    }
}
