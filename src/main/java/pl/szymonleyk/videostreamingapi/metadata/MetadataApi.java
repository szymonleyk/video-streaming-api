package pl.szymonleyk.videostreamingapi.metadata;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/videos")
public class MetadataApi {

    private final MetadataService metadataService;

    @PostMapping("/{videoId}/metadata")
    public void publish(@PathVariable UUID videoId, @RequestBody MetadataDto metadataDto){
        metadataService.add(metadataDto, videoId);
    }
}
