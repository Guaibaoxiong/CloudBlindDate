/*
 * Copyright (C) 2020 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.cloudblind.fragment.profile;

import com.xuexiang.cloudblind.R;
import com.xuexiang.cloudblind.core.BaseFragment;
import com.xuexiang.xpage.annotation.Page;

/**
 * @author xuexiang
 * @since 2020/9/6 9:26 PM
 */
@Page(name = "收藏")
public class StarFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_stars;
    }

    @Override
    protected void initViews() {

    }
}

