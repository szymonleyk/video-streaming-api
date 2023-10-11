package pl.szymonleyk.videostreamingapi.video;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/videos")
public class VideoApi {

    private final VideoService videoService;

    @PostMapping
    public Video publish(@RequestBody String content){
        return videoService.publish(content);
    }
}
