/*
 * ADL2-core
 * Copyright (c) 2013-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of ADL2-core.
 *
 * ADL2-core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.openehr.designer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openehr.designer.ObjectMapperFactoryBean;
import org.openehr.jaxb.am.CReal;
import org.testng.annotations.Test;

import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class ObjectMapperFactoryBeanTest {

    @Test
    public void testSerialize() throws Exception {
        ObjectMapperFactoryBean factory = new ObjectMapperFactoryBean();
        ObjectMapper mapper = factory.getObject();

        CReal creal = new CReal();
        creal.setAssumedValue((float)12.0);

        String str = mapper.writeValueAsString(creal);
        Map<String, Object> map = mapper.readValue(str, Map.class);
        assertThat(map.get("@type")).isEqualTo("C_REAL");
        assertThat((double)map.get("assumed_value")).isEqualTo(12.0);

    }
}