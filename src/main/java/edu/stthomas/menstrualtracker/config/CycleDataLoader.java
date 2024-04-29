// package edu.stthomas.menstrualtracker.config;

// import java.io.InputStream;
// import java.util.List;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import com.fasterxml.jackson.core.type.TypeReference;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import edu.stthomas.menstrualtracker.model.MyCycle;
// import edu.stthomas.menstrualtracker.repository.CycleRepository;

// @Component
// public class CycleDataLoader implements CommandLineRunner {

//     private final CycleRepository repository;
//     private final ObjectMapper objectMapper;  // deserialize json into objects

//     public CycleDataLoader(CycleRepository repository, ObjectMapper objectMapper){
//         this.repository = repository;
//         this.objectMapper = objectMapper;
//     }    

//     @Override
//     public void run(String... args) throws Exception {
//         // getResourceAsStream finds a resouce with a given name.
//         if(repository.count() == 0){
//             try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data/CycleData.json")){
//                 // objectMapper reads json fron inputStream and creates a type from each item
//                 // TypeReference is an abstract class that gives a reference of the data type you want after
//                 // json parsing is complete. 
//                 repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<MyCycle>>(){}));
//             }
//         }
//     }
    
// }
