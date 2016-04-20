/*
 *
 *  Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package springfox.bean.validators.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.bean.validators.plugins.MinMaxAnnotationPlugin;
import springfox.bean.validators.plugins.NotNullAnnotationPlugin;
import springfox.bean.validators.plugins.SizeAnnotationPlugin;

@Configuration
public class BeanValidatorPluginsConfiguration {
  @Bean
  public MinMaxAnnotationPlugin minMaxPlugin() {
    return new MinMaxAnnotationPlugin();
  }

  @Bean
  public SizeAnnotationPlugin sizePlugin() {
    return new SizeAnnotationPlugin();
  }

  @Bean
  public NotNullAnnotationPlugin notNullPlugin() {
    return new NotNullAnnotationPlugin();
  }
}