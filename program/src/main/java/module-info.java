import com.aptkode.repository.CrudRepository;

module program {
    requires com.aptkode.entity;
    requires repository;
    uses CrudRepository;
    exports com.aptkode;
}