// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.awalerting.sampleimpl.rule;

import com.google.api.ads.adwords.awalerting.AlertRule;
import com.google.api.ads.adwords.awalerting.report.ReportRow;
import com.google.gson.JsonObject;

import java.util.List;

/**
 * A dummy alert rule implementation that doesn't modify the report.
 * Note that it must be thread-safe.
 *
 * <p>The JSON config should look like:
 * <pre>
 * {
 *   "ClassName": "NoOpAlertRule"
 * }
 * </pre>
 */
public class NoOpAlertRule extends AlertRule {
  public NoOpAlertRule(JsonObject config) {
    super(config);
  }

  @Override
  public List<String> newReportHeaderFields() {
    return null;
  }

  @Override
  public void appendReportEntryFields(ReportRow entry) {}

  @Override
  public boolean shouldRemoveReportEntry(ReportRow entry) {
    return false;
  }
}
