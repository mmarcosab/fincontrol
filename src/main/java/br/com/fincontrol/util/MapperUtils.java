package br.com.fincontrol.util;

import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

public final class MapperUtils {

    public static  <D> D  map(Object obj, Type destinationType){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(obj, destinationType);
    }

}
