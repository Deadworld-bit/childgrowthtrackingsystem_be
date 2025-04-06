package G5_SWP391.ChildGrownTracking.dtos;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ChildResponseDTO {
    private Long id;
    private String name;
    private Date dob;
    private String gender;
    private String parentName;
    private String doctorName;// userName thay vì parenId
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private boolean status;

    public ChildResponseDTO(Long id, String name, Date dob, String gender, String parentName, String doctorName, LocalDateTime createDate, LocalDateTime updateDate, boolean status) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.parentName = parentName;
        this.doctorName = doctorName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.status = status;
    }
}
