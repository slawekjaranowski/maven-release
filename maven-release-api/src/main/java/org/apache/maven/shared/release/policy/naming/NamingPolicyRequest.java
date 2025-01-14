package org.apache.maven.shared.release.policy.naming;

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

/**
 * <p>NamingPolicyRequest class.</p>
 *
 * @author Robert Scholte
 * @since 3.0.0-M5
 */
public class NamingPolicyRequest
{
    private String groupId;
    
    private String artifactId;
    
    private String version;

    /**
     * <p>Getter for the field <code>groupId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getGroupId()
    {
        return groupId;
    }

    /**
     * <p>Setter for the field <code>groupId</code>.</p>
     *
     * @param groupId a {@link java.lang.String} object
     * @return a {@link org.apache.maven.shared.release.policy.naming.NamingPolicyRequest} object
     */
    public NamingPolicyRequest setGroupId( String groupId )
    {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>Getter for the field <code>artifactId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getArtifactId()
    {
        return artifactId;
    }

    /**
     * <p>Setter for the field <code>artifactId</code>.</p>
     *
     * @param artifactId a {@link java.lang.String} object
     * @return a {@link org.apache.maven.shared.release.policy.naming.NamingPolicyRequest} object
     */
    public NamingPolicyRequest setArtifactId( String artifactId )
    {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * <p>Getter for the field <code>version</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * <p>Setter for the field <code>version</code>.</p>
     *
     * @param version a {@link java.lang.String} object
     * @return a {@link org.apache.maven.shared.release.policy.naming.NamingPolicyRequest} object
     */
    public NamingPolicyRequest setVersion( String version )
    {
        this.version = version;
        return this;
    }
}
