package pl.szymonleyk.videostreamingapi.video;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public UUID add(VideoDto videoDto) {
        return videoRepository.save(videoDto.asVideo()).getId();
    }

    public Video findById(UUID id) {
        return videoRepository.findById(id).get();
    }
}
