package pl.szymonleyk.videostreamingapi.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {
    List<Metadata> findAllByVideo_Active(boolean active);
}
