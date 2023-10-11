package pl.szymonleyk.videostreamingapi.video;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/videos")
public class VideoApi {

    private final VideoService videoService;

    @PostMapping
    public Long publish(@RequestBody VideoDto videoDto) {
        return videoService.add(videoDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        videoService.delist(id);
    }

    @GetMapping("/{id}/load")
    public VideoDto load(@PathVariable Long id) {
        return videoService.load(id);
    }

    @GetMapping("/{id}/play")
    public String play(@PathVariable Long id) {
        return videoService.play(id);
    }
}
