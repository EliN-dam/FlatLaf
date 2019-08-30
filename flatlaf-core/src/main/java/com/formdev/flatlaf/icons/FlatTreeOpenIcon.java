/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.icons;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.UIManager;

/**
 * "open" icon for {@link javax.swing.JTree} used by {@link javax.swing.tree.DefaultTreeCellRenderer}.
 *
 * @uiDefault Tree.icon.openColor			Color
 *
 * @author Karl Tauber
 */
public class FlatTreeOpenIcon
	extends FlatAbstractIcon
{
	public FlatTreeOpenIcon() {
		super( 16, 16, UIManager.getColor( "Tree.icon.openColor" ) );
	}

	@Override
	protected void paintIcon( Component c, Graphics2D g ) {
		/*
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16">
			  <g fill="none" fill-rule="evenodd">
			    <path fill="#D8D8D8" d="M1 2L6 2 8 4 14 4 14 6 3.5 6 1 11z"/>
			    <path fill="#D8D8D8" d="M4 7L16 7 13 13 1 13z"/>
			  </g>
			</svg>
		*/

		Path2D arrow = new Path2D.Float();
		arrow.moveTo( 1, 2 );
		arrow.lineTo( 6, 2 );
		arrow.lineTo( 8, 4 );
		arrow.lineTo( 14, 4 );
		arrow.lineTo( 14, 6 );
		arrow.lineTo( 3.5, 6 );
		arrow.lineTo( 1, 11 );
		arrow.closePath();
		g.fill( arrow );

		arrow = new Path2D.Float();
		arrow.moveTo( 4, 7 );
		arrow.lineTo( 16, 7 );
		arrow.lineTo( 13, 13 );
		arrow.lineTo( 1, 13 );
		arrow.closePath();
		g.fill( arrow );
	}
}
