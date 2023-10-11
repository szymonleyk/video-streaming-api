package pl.szymonleyk.videostreamingapi.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MetadataRepository extends JpaRepository<Metadata, UUID> {

}
