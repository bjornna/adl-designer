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

import com.fasterxml.jackson.annotation.JsonInclude;
import org.openehr.jaxb.rm.MultiplicityInterval;

import java.util.Map;

/**
 * @author Marko Pipan
 */
public class ReferenceModelData {
    private String name;
    private String version;
    private Map<String, Type> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Type> getTypes() {
        return types;
    }

    public void setTypes(Map<String, Type> types) {
        this.types = types;
    }

    public static class Type {
        private String name;
        private String parent;
        private Map<String, Attribute> attributes;
        private boolean finalType;
        private String dataAttribute;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public Map<String, Attribute> getAttributes() {
            return attributes;
        }

        public void setAttributes(Map<String, Attribute> attributes) {
            this.attributes = attributes;
        }

        @JsonInclude(JsonInclude.Include.NON_DEFAULT)
        public boolean isFinalType() {
            return finalType;
        }

        public void setFinalType(boolean finalType) {
            this.finalType = finalType;
        }

        public String getDataAttribute() {
            return dataAttribute;
        }

        public void setDataAttribute(String dataAttribute) {
            this.dataAttribute = dataAttribute;
        }
    }

    public static class Attribute {
        private String name;
        private String type;
        private MultiplicityInterval existence;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public MultiplicityInterval getExistence() {
            return existence;
        }

        public void setExistence(MultiplicityInterval existence) {
            this.existence = existence;
        }
    }
}
