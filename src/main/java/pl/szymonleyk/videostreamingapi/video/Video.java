package pl.szymonleyk.videostreamingapi.video;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    private UUID id;
    private String content;
}
