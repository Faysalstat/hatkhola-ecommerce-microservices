package com.myprojects.productservice.serviceImp;

import com.myprojects.productservice.domain.CommandResponse;
import com.myprojects.productservice.model.ProductEntity;
import com.myprojects.productservice.repository.ProductRepository;
import com.myprojects.productservice.service.ProductService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public Optional<ProductEntity> findAllById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }


    @KafkaListener(
            topicPartitions =
            @TopicPartition(
                    topic = "topicName",
                    partitionOffsets = {@PartitionOffset(partition = "1", initialOffset = "0")}),
            groupId = "swift-group")
    public void listenGroupFoo(Object message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
