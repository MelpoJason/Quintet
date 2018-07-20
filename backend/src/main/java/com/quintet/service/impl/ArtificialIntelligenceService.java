/*
 * For personal use;
 */

package com.quintet.service.impl;

import com.google.common.collect.Lists;
import com.quintet.model.dto.GenericDTO;
import com.quintet.service.ArtificialIntelligenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArtificialIntelligenceService implements ArtificialIntelligenceServiceImpl {


    @Override
    public GenericDTO baseInfo(Integer userId) {
        assert userId == 1;
        return GenericDTO.getReturnDTO(Lists.newArrayList());
    }
}
