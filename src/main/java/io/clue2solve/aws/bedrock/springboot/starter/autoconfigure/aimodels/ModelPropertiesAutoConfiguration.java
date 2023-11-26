package io.clue2solve.aws.bedrock.springboot.starter.autoconfigure.aimodels;

import io.clue2solve.aws.bedrock.springboot.starter.config.ClaudeProperties;
import io.clue2solve.aws.bedrock.springboot.starter.config.JurassicProperties;
import io.clue2solve.aws.bedrock.springboot.starter.config.LlamaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ClaudeProperties.class, JurassicProperties.class, LlamaProperties.class})
public class ModelPropertiesAutoConfiguration {}