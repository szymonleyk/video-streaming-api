package pl.szymonleyk.videostreamingapi.video;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.szymonleyk.videostreamingapi.metadata.Metadata;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private boolean active;

    @OneToOne(mappedBy = "video", cascade = CascadeType.ALL)
    private Metadata metadata;
}
