package com.tvd12.ezyfoxserver.response;

import com.tvd12.ezyfoxserver.builder.EzyArrayBuilder;
import com.tvd12.ezyfoxserver.constant.EzyConstant;
import com.tvd12.ezyfoxserver.entity.EzyArray;
import com.tvd12.ezyfoxserver.util.EzyEntityBuilders;

import lombok.Getter;

@Getter
public class EzySimpleResponse extends EzyEntityBuilders implements EzyResponse {
    private static final long serialVersionUID = -4029390577782160165L;
    
    protected EzyConstant command;
    
    public EzySimpleResponse(EzyConstant command) {
        this.command = command;
    }
    
    @Override
    public final EzyArray serialize() {
        EzyArrayBuilder arrayBuilder = newArrayBuilder();
        arrayBuilder.append(command.getId());
        serialize(arrayBuilder);
        return arrayBuilder.build();
    }
    
    protected void serialize(EzyArrayBuilder arrayBuilder) {
    }
    
    @Override
    public void release() {
        this.command = null;
    }
    
}