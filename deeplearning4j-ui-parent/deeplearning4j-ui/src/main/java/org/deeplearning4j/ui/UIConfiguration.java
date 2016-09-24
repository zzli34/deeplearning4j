/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package org.deeplearning4j.ui;

import org.nd4j.shade.dwjackson.annotation.JsonProperty;
import org.nd4j.shade.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Adam Gibson
 */
public class UIConfiguration extends Configuration {
    @JsonProperty
    @NotNull
    @Valid
    private String uploadPath = System.getProperty("java.io.tmpdir");

    public String getUploadPath() {
        if(uploadPath == null || uploadPath.isEmpty())
            uploadPath = System.getProperty("java.io.tmpdir");
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}
