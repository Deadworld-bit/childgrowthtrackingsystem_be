package G5_SWP391.ChildGrownTracking.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateChildRequestDTO {
    @NotNull(message = "name is required.")
    private String name;

    @NotNull(message = "dob is required.")
    private Date dob;

    @NotNull(message = "gender is required.")
    private String gender;
}
