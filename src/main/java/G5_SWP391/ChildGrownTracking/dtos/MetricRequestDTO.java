package G5_SWP391.ChildGrownTracking.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetricRequestDTO {

    @NotNull(message = "Child ID is required.")
    private Long childId;

    @NotNull(message = "Weight is required.")
    private BigDecimal weight;

    @NotNull(message = "Height is required.")
    private BigDecimal height;

    @NotNull(message = "Recorded date is required.")
    private LocalDateTime recordedDate;
}
