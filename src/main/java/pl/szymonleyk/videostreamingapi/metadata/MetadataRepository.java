package pl.szymonleyk.videostreamingapi.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {

}
