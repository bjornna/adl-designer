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

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.openehr.am.AmObject;
import org.openehr.jaxb.am.ArchetypeOntology;
import org.openehr.jaxb.rm.AuthoredResource;
import org.openehr.rm.RmObject;

/**
 * @author Marko Pipan
 */
public class AmMixinModule extends SimpleModule {

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(AmObject.class, AmObjectMixin.class);
        context.setMixInAnnotations(RmObject.class, AmObjectMixin.class);
        context.setMixInAnnotations(ArchetypeOntology.class, ArchetypeOntologyMixin.class);
        context.setMixInAnnotations(AuthoredResource.class, AuthoredResourceMixin.class);
        super.setupModule(context);
    }
}
