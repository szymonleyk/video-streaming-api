package pl.szymonleyk.videostreamingapi.metadata;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szymonleyk.videostreamingapi.video.Video;
import pl.szymonleyk.videostreamingapi.video.VideoRepository;
import pl.szymonleyk.videostreamingapi.video.VideoService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MetadataService {
    private final MetadataRepository metadataRepository;
    private final VideoService videoService;

    public void add(MetadataDto metadataDto, UUID videoId) {
        Metadata metadata = metadataDto.asMetadata();
        metadata.setVideo(videoService.findById(videoId));
        metadataRepository.save(metadata);
    }
}
