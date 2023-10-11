package pl.szymonleyk.videostreamingapi.video;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;
    public Video publish(String content) {
        return videoRepository.save(new Video(UUID.randomUUID(), content));
    }
}
