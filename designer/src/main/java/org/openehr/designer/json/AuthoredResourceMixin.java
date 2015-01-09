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

package org.openehr.designer.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openehr.jaxb.rm.AnnotationSet;
import org.openehr.jaxb.rm.AuthoredResource;

import java.util.List;

/**
 * @author Marko Pipan
 */
public class AuthoredResourceMixin extends AuthoredResource{
    @JsonDeserialize(converter = AnnotationSetMapToListConverter.class)
    @JsonSerialize(converter = AnnotationSetListToMapConverter.class)
    @Override
    public List<AnnotationSet> getAnnotations() {
        return super.getAnnotations();
    }
}
