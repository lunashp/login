package kr.co.dajsoft.hell0.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO {
    private int page;
    private int size;
    private String type;
    private String keyword;

    public PageRequestDTO() {
        page = 1;
        size = 10;
    }
}
