/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.examples;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.drools.examples.broker.BrokerExample;
import org.drools.examples.conway.ui.ConwayGUI;
import org.drools.examples.numberguess.NumberGuessExample;

public class DroolsJbpmIntegrationExamplesApp extends JFrame {

    public static void main(String[] args) {
        DroolsJbpmIntegrationExamplesApp droolsJbpmIntegrationExamplesApp = new DroolsJbpmIntegrationExamplesApp();
        droolsJbpmIntegrationExamplesApp.pack();
        droolsJbpmIntegrationExamplesApp.setVisible(true);
    }

    public DroolsJbpmIntegrationExamplesApp() {
        super("JBoss BRMS examples");
        setContentPane(createContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Container createContentPane() {
        JPanel contentPane = new JPanel(new GridLayout(0, 1));
        contentPane.add(new JLabel("Which GUI example do you want to see?"));

        contentPane.add(new JButton(new AbstractAction("ConwayGUI") {
            public void actionPerformed(ActionEvent e) {
                ConwayGUI.main(new String[0]);
            }
        }));
        contentPane.add(new JButton(new AbstractAction("BrokerExample (Fusion CEP)") {
            public void actionPerformed(ActionEvent e) {
                BrokerExample.main(new String[0]);
            }
        }));

        contentPane.add(new JLabel("Which output example do you want to see?"));
        
        contentPane.add(new JButton(new AbstractAction("NumberGuessExample") {
            public void actionPerformed(ActionEvent e) {
                NumberGuessExample.main(new String[0]);
            }
        }));
        return contentPane;
    }

}
