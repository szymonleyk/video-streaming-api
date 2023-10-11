package pl.szymonleyk.videostreamingapi.video;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.szymonleyk.videostreamingapi.metadata.Metadata;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    private UUID id;
    private String content;

    @OneToOne(mappedBy = "video", cascade = CascadeType.ALL)
    private Metadata metadata;
}
