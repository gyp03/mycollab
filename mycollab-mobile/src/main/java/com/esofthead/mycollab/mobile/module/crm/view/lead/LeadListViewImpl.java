/**
 * This file is part of mycollab-mobile.
 *
 * mycollab-mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.mobile.module.crm.view.lead;

import com.esofthead.mycollab.eventmanager.EventBus;
import com.esofthead.mycollab.mobile.module.crm.events.LeadEvent;
import com.esofthead.mycollab.mobile.ui.AbstractListViewComp;
import com.esofthead.mycollab.mobile.ui.AbstractPagedBeanList;
import com.esofthead.mycollab.module.crm.domain.SimpleLead;
import com.esofthead.mycollab.module.crm.domain.criteria.LeadSearchCriteria;
import com.esofthead.mycollab.vaadin.mvp.ViewComponent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;

/**
 * 
 * @author MyCollab Ltd.
 * @since 4.1
 * 
 */

@ViewComponent
public class LeadListViewImpl extends
		AbstractListViewComp<LeadSearchCriteria, SimpleLead> implements
		LeadListView {
	private static final long serialVersionUID = -5311139413938817084L;

	public LeadListViewImpl() {
		super();

		setCaption("Leads");
		setToggleButton(true);
	}

	@Override
	protected AbstractPagedBeanList<LeadSearchCriteria, SimpleLead> createBeanTable() {
		return new LeadListDisplay("leadName");
	}

	@Override
	protected Component createRightComponent() {
		Button addLead = new Button(null, new Button.ClickListener() {
			private static final long serialVersionUID = -6024437571619598638L;

			@Override
			public void buttonClick(ClickEvent event) {
				EventBus.getInstance().fireEvent(
						new LeadEvent.GotoAdd(this, null));
			}
		});
		addLead.setStyleName("add-btn");
		return addLead;
	}

}
