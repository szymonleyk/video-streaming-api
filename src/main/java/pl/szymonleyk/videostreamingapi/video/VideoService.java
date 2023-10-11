package pl.szymonleyk.videostreamingapi.video;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public Long add(VideoDto videoDto) {
        return videoRepository.save(videoDto.asVideo()).getId();
    }

    public Video findById(Long id) {
        return videoRepository.findById(id).get();
    }
}
