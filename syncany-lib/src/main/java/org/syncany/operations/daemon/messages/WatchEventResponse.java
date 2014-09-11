/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.operations.daemon.messages;

import org.simpleframework.xml.Element;

public class WatchEventResponse extends Response {
	@Element(required = true)
	private String root;
	
	@Element(required = true)
	private String action;
	
	@Element(required = false)
	private String subject;
	
	public WatchEventResponse(String root, String action) {
		this(root, action, null);
	}	
	
	public WatchEventResponse(String root, String action, String subject) {
		super(200, null, null);
		
		this.root = root;
		this.action = action;
		this.subject = subject;
	}	
		
	public String getAction() {
		return action;
	}
	
	public String getSubject() {
		return subject;
	}
}
