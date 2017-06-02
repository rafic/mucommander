/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2017 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.action.impl;

import java.util.Map;

import com.mucommander.ui.action.ActionDescriptor;
import com.mucommander.ui.action.ActionFactory;
import com.mucommander.ui.action.MuAction;
import com.mucommander.ui.main.MainFrame;

/**
 * Recalls window number 9 (brings it to the front).
 *
 * @author Maxence Bernard
 */
public class RecallWindow9Action extends RecallWindowAction {

    public RecallWindow9Action(MainFrame mainFrame, Map<String,Object> properties) {
        super(mainFrame, properties, 9);
    }
    
    public static class Factory implements ActionFactory {

		public MuAction createAction(MainFrame mainFrame, Map<String,Object> properties) {
			return new RecallWindow9Action(mainFrame, properties);
		}
    }

    @Override
    public ActionDescriptor getDescriptor() {
        return new Descriptor();
    }

    public static class Descriptor extends RecallWindowAction.Descriptor {
        public static final String ACTION_ID = RecallWindowAction.Descriptor.ACTION_ID+"9";

        public Descriptor() {
            super(9);
        }
    }
}
