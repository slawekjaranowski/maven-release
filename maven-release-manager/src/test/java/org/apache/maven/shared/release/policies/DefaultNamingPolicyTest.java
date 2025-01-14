package org.apache.maven.shared.release.policies;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.junit.Assert.assertEquals;

import org.apache.maven.shared.release.policy.naming.NamingPolicyRequest;
import org.junit.Test;

public class DefaultNamingPolicyTest
{
    private final DefaultNamingPolicy policy = new DefaultNamingPolicy();

    @Test
    public void testName() throws Exception
    {
        assertEquals( "ARTIFACTID-VERSION",
                      policy.getName( newNamingPolicyRequest( "ARTIFACTID", "VERSION" ) ).getName() );
        assertEquals( "ARTIFACTID-1.0-SNAPSHOT",
                      policy.getName( newNamingPolicyRequest( "ARTIFACTID", "1.0-SNAPSHOT" ) ).getName() );
    }

    private NamingPolicyRequest newNamingPolicyRequest( String artifactId, String version )
    {
        return new NamingPolicyRequest().setArtifactId( artifactId ).setVersion( version );
    }
}
