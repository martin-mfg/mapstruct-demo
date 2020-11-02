package org.example;

import org.mapstruct.Mapper;

@Mapper
public interface DemoMapper {

  Destination map(Source source);

}
