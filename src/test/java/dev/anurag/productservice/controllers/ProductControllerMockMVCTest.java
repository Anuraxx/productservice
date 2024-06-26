package dev.anurag.productservice.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.anurag.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//@SpringBootTest
//@AutoConfigureMockMvc
@WebMvcTest(ProductController.class)
public class ProductControllerMockMVCTest {
    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

//    @Test
    public void testGetProductByIdAPI() throws Exception {
//        GenericProductDto genericProductDto = new GenericProductDto();
//        genericProductDto.setId(1L);
//        genericProductDto.setTitle("iPhone");
//        genericProductDto.setCategory("electronics");
//
//        when(productService.getProductById(1L))
//                .thenReturn(genericProductDto);
//
//       ResultActions resultActions = mockMvc.perform(get("/products/1"))
//                .andExpect(status().is(200))
//               .andExpect(content().json("{\"id\":1,\"title\":\"iPhone\",\"description\":null,\"image\":null,\"category\":\"electronics\",\"price\":0.0}"))
//               .andExpect(jsonPath("$.id").value(1L));
//
//       String responseString = resultActions.andReturn().getResponse().getContentAsString();
//
//        Assertions.assertEquals("{\"id\":1,\"title\":\"iPhone\",\"description\":null,\"image\":null,\"category\":\"electronics\",\"price\":0.0}",
//                responseString);
//
//        GenericProductDto responseDto = objectMapper.readValue(responseString, GenericProductDto.class);
//
//        Assertions.assertNotNull(responseDto);
//        Assertions.assertEquals(1L, responseDto.getId());
    }
}
