/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.build.gradle.internal.model;

import com.android.annotations.NonNull;
import com.android.build.gradle.model.BuildTypeContainer;
import com.android.build.gradle.model.Dependencies;
import com.android.builder.model.BuildType;
import com.android.builder.model.SourceProvider;

import java.io.Serializable;

class BuildTypeContainerImpl implements BuildTypeContainer, Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull
    private final BuildType buildType;
    @NonNull
    private final SourceProvider sourceProvider;
    @NonNull
    private final DependenciesImpl dependencies;

    BuildTypeContainerImpl(@NonNull BuildTypeImpl buildType,
                           @NonNull SourceProviderImpl sourceProvider,
                           @NonNull DependenciesImpl dependencies) {
        this.buildType = buildType;
        this.sourceProvider = sourceProvider;
        this.dependencies = dependencies;
    }

    @Override
    @NonNull
    public BuildType getBuildType() {
        return buildType;
    }

    @NonNull
    @Override
    public Dependencies getDependency() {
        return dependencies;
    }

    @Override
    @NonNull
    public SourceProvider getSourceProvider() {
        return sourceProvider;
    }
}
