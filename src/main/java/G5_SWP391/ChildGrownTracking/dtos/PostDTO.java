package G5_SWP391.ChildGrownTracking.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostDTO {
    private Long userId ;
    private Long childId;
    private String title;
    private String description;

}
