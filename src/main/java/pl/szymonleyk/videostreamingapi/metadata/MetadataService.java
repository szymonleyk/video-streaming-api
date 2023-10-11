package pl.szymonleyk.videostreamingapi.metadata;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szymonleyk.videostreamingapi.video.VideoService;

@Service
@RequiredArgsConstructor
public class MetadataService {
    private final MetadataRepository metadataRepository;
    private final VideoService videoService;

    public void add(MetadataDto metadataDto, Long videoId) {
        Metadata metadata = metadataDto.asMetadata();
        metadata.setVideo(videoService.findById(videoId));
        metadataRepository.save(metadata);
    }

}
