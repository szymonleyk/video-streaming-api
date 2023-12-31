package pl.szymonleyk.videostreamingapi.metadata;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/videos")
public class MetadataApi {

    private final MetadataService metadataService;

    @PostMapping("/{videoId}/metadata")
    public void add(@PathVariable Long videoId, @RequestBody MetadataDto metadataDto){
        metadataService.add(metadataDto, videoId);
    }

    @PutMapping("/{videoId}/metadata")
    public void update(@PathVariable Long videoId, @RequestBody MetadataDto metadataDto){
        metadataService.add(metadataDto, videoId);
    }

    @GetMapping("/metadata")
    public List<MetadataDto> allActiveMetadata(){
        return metadataService.findAllActiveMetadata();
    }
}
