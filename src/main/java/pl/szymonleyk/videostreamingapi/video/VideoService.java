package pl.szymonleyk.videostreamingapi.video;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szymonleyk.videostreamingapi.metadata.MetadataDto;

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

    public void delist(Long id) {
        Video video = findById(id);
        video.setActive(false);
        videoRepository.save(video);
    }

    public VideoDto load(Long id) {
        return VideoDto.from(videoRepository.findById(id).get());
    }

    public String play(Long id) {
        return VideoDto.from(videoRepository.findById(id).get()).content();
    }
}
