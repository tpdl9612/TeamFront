package com.example.back.dto.request.product;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PostProductRequestDto {

    @NotBlank
    private String productId;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String lowPrice;
    @NotBlank
    private String category1;
    @NotBlank
    private String category2;
    @NotBlank
    private String category3;

    private List<String> productImageList;

    private List<String> secondaryProductImageList;
}
