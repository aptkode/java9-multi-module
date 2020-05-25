import com.aptkode.memory.repository.InMemoryUserCrudRepo;
import com.aptkode.repository.CrudRepository;

module in.memory.repository {
    requires com.aptkode.entity;
    requires repository;
    exports com.aptkode.memory.repository;
    provides CrudRepository with InMemoryUserCrudRepo;
}