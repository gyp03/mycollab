/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.file.event

import com.mycollab.vaadin.event.ApplicationEvent
import com.mycollab.module.ecm.domain.ExternalDrive
import com.mycollab.module.ecm.domain.Resource

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
object FileEvent {
    class GotoList(source: Any, val data: Any?) : ApplicationEvent(source)

    class ResourceRemovedEvent(source: Any, val data: Resource) : ApplicationEvent(source)

    class ExternalDriveConnectedEvent(source: Any, val data: ExternalDrive) : ApplicationEvent(source)

    class ExternalDriveDeleteEvent(source: Any, val data: ExternalDrive) : ApplicationEvent(source)
}