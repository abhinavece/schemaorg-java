package com.google.schemaorg.core;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.FAQPage;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link FAQPage}. */
public class FAQPageImpl extends WebPageImpl implements FAQPage {

	private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

	private static ImmutableSet<String> initializePropertySet() {
		ImmutableSet.Builder<String> builder = ImmutableSet.builder();
		builder.add(CoreConstants.PROPERTY_MAIN_ENTITY);
		
		return builder.build();
	}

	static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<FAQPage.Builder> implements FAQPage.Builder {

//		@Override
//		public FAQPage.Builder addMainEntity(Thing value) {
//			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
//		}
//
//		@Override
//		public FAQPage.Builder addMainEntity(Thing.Builder value) {
//			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
//		}
//
//		@Override
//		public FAQPage.Builder addMainEntity(String value) {
//			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
//		}
//		
//	    @Override
//	    public FAQPage.Builder addPopularityScore(PopularityScoreSpecification value) {
//	      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
//	    }
//
//	    @Override
//	    public FAQPage.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
//	      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
//	    }
//
//	    @Override
//	    public FAQPage.Builder addPopularityScore(String value) {
//	      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
//	    }

//		@Override
//		public FAQPage build() {
//			return new FAQPageImpl(properties, reverseMap);
//		}

		// ******************************************************************************************************************

		@Override
		public FAQPage.Builder addAbout(Thing value) {
			return addProperty(CoreConstants.PROPERTY_ABOUT, value);
		}

		@Override
		public FAQPage.Builder addAbout(Thing.Builder value) {
			return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
		}

		@Override
		public FAQPage.Builder addAbout(String value) {
			return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAccessibilityAPI(Text value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
		}

		@Override
		public FAQPage.Builder addAccessibilityAPI(String value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAccessibilityControl(Text value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
		}

		@Override
		public FAQPage.Builder addAccessibilityControl(String value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAccessibilityFeature(Text value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
		}

		@Override
		public FAQPage.Builder addAccessibilityFeature(String value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAccessibilityHazard(Text value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
		}

		@Override
		public FAQPage.Builder addAccessibilityHazard(String value) {
			return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAccountablePerson(Person value) {
			return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
		}

		@Override
		public FAQPage.Builder addAccountablePerson(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
		}

		@Override
		public FAQPage.Builder addAccountablePerson(String value) {
			return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAdditionalType(URL value) {
			return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
		}

		@Override
		public FAQPage.Builder addAdditionalType(String value) {
			return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAggregateRating(AggregateRating value) {
			return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
		}

		@Override
		public FAQPage.Builder addAggregateRating(AggregateRating.Builder value) {
			return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
		}

		@Override
		public FAQPage.Builder addAggregateRating(String value) {
			return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAlternateName(Text value) {
			return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
		}

		@Override
		public FAQPage.Builder addAlternateName(String value) {
			return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAlternativeHeadline(Text value) {
			return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
		}

		@Override
		public FAQPage.Builder addAlternativeHeadline(String value) {
			return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAssociatedMedia(MediaObject value) {
			return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
		}

		@Override
		public FAQPage.Builder addAssociatedMedia(MediaObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
		}

		@Override
		public FAQPage.Builder addAssociatedMedia(String value) {
			return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAudience(Audience value) {
			return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
		}

		@Override
		public FAQPage.Builder addAudience(Audience.Builder value) {
			return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
		}

		@Override
		public FAQPage.Builder addAudience(String value) {
			return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAudio(AudioObject value) {
			return addProperty(CoreConstants.PROPERTY_AUDIO, value);
		}

		@Override
		public FAQPage.Builder addAudio(AudioObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
		}

		@Override
		public FAQPage.Builder addAudio(String value) {
			return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAuthor(Organization value) {
			return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
		}

		@Override
		public FAQPage.Builder addAuthor(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
		}

		@Override
		public FAQPage.Builder addAuthor(Person value) {
			return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
		}

		@Override
		public FAQPage.Builder addAuthor(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
		}

		@Override
		public FAQPage.Builder addAuthor(String value) {
			return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAward(Text value) {
			return addProperty(CoreConstants.PROPERTY_AWARD, value);
		}

		@Override
		public FAQPage.Builder addAward(String value) {
			return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
		}

		@Override
		public FAQPage.Builder addAwards(Text value) {
			return addProperty(CoreConstants.PROPERTY_AWARDS, value);
		}

		@Override
		public FAQPage.Builder addAwards(String value) {
			return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addBreadcrumb(BreadcrumbList value) {
			return addProperty(CoreConstants.PROPERTY_BREADCRUMB, value);
		}

		@Override
		public FAQPage.Builder addBreadcrumb(BreadcrumbList.Builder value) {
			return addProperty(CoreConstants.PROPERTY_BREADCRUMB, value.build());
		}

		@Override
		public FAQPage.Builder addBreadcrumb(Text value) {
			return addProperty(CoreConstants.PROPERTY_BREADCRUMB, value);
		}

		@Override
		public FAQPage.Builder addBreadcrumb(String value) {
			return addProperty(CoreConstants.PROPERTY_BREADCRUMB, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCharacter(Person value) {
			return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
		}

		@Override
		public FAQPage.Builder addCharacter(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
		}

		@Override
		public FAQPage.Builder addCharacter(String value) {
			return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCitation(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_CITATION, value);
		}

		@Override
		public FAQPage.Builder addCitation(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
		}

		@Override
		public FAQPage.Builder addCitation(Text value) {
			return addProperty(CoreConstants.PROPERTY_CITATION, value);
		}

		@Override
		public FAQPage.Builder addCitation(String value) {
			return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addComment(Comment value) {
			return addProperty(CoreConstants.PROPERTY_COMMENT, value);
		}

		@Override
		public FAQPage.Builder addComment(Comment.Builder value) {
			return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
		}

		@Override
		public FAQPage.Builder addComment(String value) {
			return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCommentCount(Integer value) {
			return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
		}

		@Override
		public FAQPage.Builder addCommentCount(String value) {
			return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addContentLocation(Place value) {
			return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
		}

		@Override
		public FAQPage.Builder addContentLocation(Place.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
		}

		@Override
		public FAQPage.Builder addContentLocation(String value) {
			return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addContentRating(Text value) {
			return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
		}

		@Override
		public FAQPage.Builder addContentRating(String value) {
			return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
		}

		@Override
		public FAQPage.Builder addContributor(Organization value) {
			return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
		}

		@Override
		public FAQPage.Builder addContributor(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
		}

		@Override
		public FAQPage.Builder addContributor(Person value) {
			return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
		}

		@Override
		public FAQPage.Builder addContributor(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
		}

		@Override
		public FAQPage.Builder addContributor(String value) {
			return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCopyrightHolder(Organization value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
		}

		@Override
		public FAQPage.Builder addCopyrightHolder(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
		}

		@Override
		public FAQPage.Builder addCopyrightHolder(Person value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
		}

		@Override
		public FAQPage.Builder addCopyrightHolder(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
		}

		@Override
		public FAQPage.Builder addCopyrightHolder(String value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCopyrightYear(Number value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
		}

		@Override
		public FAQPage.Builder addCopyrightYear(String value) {
			return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addCreator(Organization value) {
			return addProperty(CoreConstants.PROPERTY_CREATOR, value);
		}

		@Override
		public FAQPage.Builder addCreator(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
		}

		@Override
		public FAQPage.Builder addCreator(Person value) {
			return addProperty(CoreConstants.PROPERTY_CREATOR, value);
		}

		@Override
		public FAQPage.Builder addCreator(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
		}

		@Override
		public FAQPage.Builder addCreator(String value) {
			return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDateCreated(Date value) {
			return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
		}

		@Override
		public FAQPage.Builder addDateCreated(DateTime value) {
			return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
		}

		@Override
		public FAQPage.Builder addDateCreated(String value) {
			return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDateModified(Date value) {
			return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
		}

		@Override
		public FAQPage.Builder addDateModified(DateTime value) {
			return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
		}

		@Override
		public FAQPage.Builder addDateModified(String value) {
			return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDatePublished(Date value) {
			return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
		}

		@Override
		public FAQPage.Builder addDatePublished(String value) {
			return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDescription(Text value) {
			return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
		}

		@Override
		public FAQPage.Builder addDescription(String value) {
			return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDiscussionUrl(URL value) {
			return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
		}

		@Override
		public FAQPage.Builder addDiscussionUrl(String value) {
			return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
		}

		@Override
		public FAQPage.Builder addEditor(Person value) {
			return addProperty(CoreConstants.PROPERTY_EDITOR, value);
		}

		@Override
		public FAQPage.Builder addEditor(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
		}

		@Override
		public FAQPage.Builder addEditor(String value) {
			return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addEducationalAlignment(AlignmentObject value) {
			return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
		}

		@Override
		public FAQPage.Builder addEducationalAlignment(AlignmentObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
		}

		@Override
		public FAQPage.Builder addEducationalAlignment(String value) {
			return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addEducationalUse(Text value) {
			return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
		}

		@Override
		public FAQPage.Builder addEducationalUse(String value) {
			return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addEncoding(MediaObject value) {
			return addProperty(CoreConstants.PROPERTY_ENCODING, value);
		}

		@Override
		public FAQPage.Builder addEncoding(MediaObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
		}

		@Override
		public FAQPage.Builder addEncoding(String value) {
			return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
		}

		@Override
		public FAQPage.Builder addEncodings(MediaObject value) {
			return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
		}

		@Override
		public FAQPage.Builder addEncodings(MediaObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
		}

		@Override
		public FAQPage.Builder addEncodings(String value) {
			return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addExampleOfWork(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
		}

		@Override
		public FAQPage.Builder addExampleOfWork(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
		}

		@Override
		public FAQPage.Builder addExampleOfWork(String value) {
			return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
		}

		@Override
		public FAQPage.Builder addFileFormat(Text value) {
			return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
		}

		@Override
		public FAQPage.Builder addFileFormat(String value) {
			return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addGenre(Text value) {
			return addProperty(CoreConstants.PROPERTY_GENRE, value);
		}

		@Override
		public FAQPage.Builder addGenre(URL value) {
			return addProperty(CoreConstants.PROPERTY_GENRE, value);
		}

		@Override
		public FAQPage.Builder addGenre(String value) {
			return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addHasPart(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
		}

		@Override
		public FAQPage.Builder addHasPart(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
		}

		@Override
		public FAQPage.Builder addHasPart(String value) {
			return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
		}

		@Override
		public FAQPage.Builder addHeadline(Text value) {
			return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
		}

		@Override
		public FAQPage.Builder addHeadline(String value) {
			return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addImage(ImageObject value) {
			return addProperty(CoreConstants.PROPERTY_IMAGE, value);
		}

		@Override
		public FAQPage.Builder addImage(ImageObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
		}

		@Override
		public FAQPage.Builder addImage(URL value) {
			return addProperty(CoreConstants.PROPERTY_IMAGE, value);
		}

		@Override
		public FAQPage.Builder addImage(String value) {
			return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addInLanguage(Language value) {
			return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
		}

		@Override
		public FAQPage.Builder addInLanguage(Language.Builder value) {
			return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
		}

		@Override
		public FAQPage.Builder addInLanguage(Text value) {
			return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
		}

		@Override
		public FAQPage.Builder addInLanguage(String value) {
			return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addInteractionStatistic(InteractionCounter value) {
			return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
		}

		@Override
		public FAQPage.Builder addInteractionStatistic(InteractionCounter.Builder value) {
			return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
		}

		@Override
		public FAQPage.Builder addInteractionStatistic(String value) {
			return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
		}

		@Override
		public FAQPage.Builder addInteractivityType(Text value) {
			return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
		}

		@Override
		public FAQPage.Builder addInteractivityType(String value) {
			return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addIsBasedOnUrl(URL value) {
			return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
		}

		@Override
		public FAQPage.Builder addIsBasedOnUrl(String value) {
			return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
		}

		@Override
		public FAQPage.Builder addIsFamilyFriendly(Boolean value) {
			return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
		}

		@Override
		public FAQPage.Builder addIsFamilyFriendly(String value) {
			return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
		}

		@Override
		public FAQPage.Builder addIsPartOf(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
		}

		@Override
		public FAQPage.Builder addIsPartOf(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
		}

		@Override
		public FAQPage.Builder addIsPartOf(String value) {
			return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
		}

		@Override
		public FAQPage.Builder addKeywords(Text value) {
			return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
		}

		@Override
		public FAQPage.Builder addKeywords(String value) {
			return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addLastReviewed(Date value) {
			return addProperty(CoreConstants.PROPERTY_LAST_REVIEWED, value);
		}

		@Override
		public FAQPage.Builder addLastReviewed(String value) {
			return addProperty(CoreConstants.PROPERTY_LAST_REVIEWED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addLearningResourceType(Text value) {
			return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
		}

		@Override
		public FAQPage.Builder addLearningResourceType(String value) {
			return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addLicense(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_LICENSE, value);
		}

		@Override
		public FAQPage.Builder addLicense(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
		}

		@Override
		public FAQPage.Builder addLicense(URL value) {
			return addProperty(CoreConstants.PROPERTY_LICENSE, value);
		}

		@Override
		public FAQPage.Builder addLicense(String value) {
			return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addLocationCreated(Place value) {
			return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
		}

		@Override
		public FAQPage.Builder addLocationCreated(Place.Builder value) {
			return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
		}

		@Override
		public FAQPage.Builder addLocationCreated(String value) {
			return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addMainContentOfPage(WebPageElement value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_CONTENT_OF_PAGE, value);
		}

		@Override
		public FAQPage.Builder addMainContentOfPage(WebPageElement.Builder value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_CONTENT_OF_PAGE, value.build());
		}

		@Override
		public FAQPage.Builder addMainContentOfPage(String value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_CONTENT_OF_PAGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addMainEntity(Thing value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
		}

		@Override
		public FAQPage.Builder addMainEntity(Thing.Builder value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
		}

		@Override
		public FAQPage.Builder addMainEntity(String value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
		}

		@Override
		public FAQPage.Builder addMainEntityOfPage(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
		}

		@Override
		public FAQPage.Builder addMainEntityOfPage(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
		}

		@Override
		public FAQPage.Builder addMainEntityOfPage(URL value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
		}

		@Override
		public FAQPage.Builder addMainEntityOfPage(String value) {
			return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addMentions(Thing value) {
			return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
		}

		@Override
		public FAQPage.Builder addMentions(Thing.Builder value) {
			return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
		}

		@Override
		public FAQPage.Builder addMentions(String value) {
			return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addName(Text value) {
			return addProperty(CoreConstants.PROPERTY_NAME, value);
		}

		@Override
		public FAQPage.Builder addName(String value) {
			return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
		}

		@Override
		public FAQPage.Builder addOffers(Offer value) {
			return addProperty(CoreConstants.PROPERTY_OFFERS, value);
		}

		@Override
		public FAQPage.Builder addOffers(Offer.Builder value) {
			return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
		}

		@Override
		public FAQPage.Builder addOffers(String value) {
			return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPosition(Integer value) {
			return addProperty(CoreConstants.PROPERTY_POSITION, value);
		}

		@Override
		public FAQPage.Builder addPosition(Text value) {
			return addProperty(CoreConstants.PROPERTY_POSITION, value);
		}

		@Override
		public FAQPage.Builder addPosition(String value) {
			return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPotentialAction(Action value) {
			return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
		}

		@Override
		public FAQPage.Builder addPotentialAction(Action.Builder value) {
			return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
		}

		@Override
		public FAQPage.Builder addPotentialAction(String value) {
			return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPrimaryImageOfPage(ImageObject value) {
			return addProperty(CoreConstants.PROPERTY_PRIMARY_IMAGE_OF_PAGE, value);
		}

		@Override
		public FAQPage.Builder addPrimaryImageOfPage(ImageObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PRIMARY_IMAGE_OF_PAGE, value.build());
		}

		@Override
		public FAQPage.Builder addPrimaryImageOfPage(String value) {
			return addProperty(CoreConstants.PROPERTY_PRIMARY_IMAGE_OF_PAGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addProducer(Organization value) {
			return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
		}

		@Override
		public FAQPage.Builder addProducer(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
		}

		@Override
		public FAQPage.Builder addProducer(Person value) {
			return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
		}

		@Override
		public FAQPage.Builder addProducer(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
		}

		@Override
		public FAQPage.Builder addProducer(String value) {
			return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
		}

		@Override
		public FAQPage.Builder addProvider(Organization value) {
			return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
		}

		@Override
		public FAQPage.Builder addProvider(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
		}

		@Override
		public FAQPage.Builder addProvider(Person value) {
			return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
		}

		@Override
		public FAQPage.Builder addProvider(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
		}

		@Override
		public FAQPage.Builder addProvider(String value) {
			return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPublication(PublicationEvent value) {
			return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
		}

		@Override
		public FAQPage.Builder addPublication(PublicationEvent.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
		}

		@Override
		public FAQPage.Builder addPublication(String value) {
			return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPublisher(Organization value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
		}

		@Override
		public FAQPage.Builder addPublisher(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
		}

		@Override
		public FAQPage.Builder addPublisher(Person value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
		}

		@Override
		public FAQPage.Builder addPublisher(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
		}

		@Override
		public FAQPage.Builder addPublisher(String value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPublishingPrinciples(URL value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
		}

		@Override
		public FAQPage.Builder addPublishingPrinciples(String value) {
			return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
		}

		@Override
		public FAQPage.Builder addRecordedAt(Event value) {
			return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
		}

		@Override
		public FAQPage.Builder addRecordedAt(Event.Builder value) {
			return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
		}

		@Override
		public FAQPage.Builder addRecordedAt(String value) {
			return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addRelatedLink(URL value) {
			return addProperty(CoreConstants.PROPERTY_RELATED_LINK, value);
		}

		@Override
		public FAQPage.Builder addRelatedLink(String value) {
			return addProperty(CoreConstants.PROPERTY_RELATED_LINK, Text.of(value));
		}

		@Override
		public FAQPage.Builder addReleasedEvent(PublicationEvent value) {
			return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
		}

		@Override
		public FAQPage.Builder addReleasedEvent(PublicationEvent.Builder value) {
			return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
		}

		@Override
		public FAQPage.Builder addReleasedEvent(String value) {
			return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addReview(Review value) {
			return addProperty(CoreConstants.PROPERTY_REVIEW, value);
		}

		@Override
		public FAQPage.Builder addReview(Review.Builder value) {
			return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
		}

		@Override
		public FAQPage.Builder addReview(String value) {
			return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
		}

		@Override
		public FAQPage.Builder addReviewedBy(Organization value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWED_BY, value);
		}

		@Override
		public FAQPage.Builder addReviewedBy(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWED_BY, value.build());
		}

		@Override
		public FAQPage.Builder addReviewedBy(Person value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWED_BY, value);
		}

		@Override
		public FAQPage.Builder addReviewedBy(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWED_BY, value.build());
		}

		@Override
		public FAQPage.Builder addReviewedBy(String value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWED_BY, Text.of(value));
		}

		@Override
		public FAQPage.Builder addReviews(Review value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
		}

		@Override
		public FAQPage.Builder addReviews(Review.Builder value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
		}

		@Override
		public FAQPage.Builder addReviews(String value) {
			return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSameAs(URL value) {
			return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
		}

		@Override
		public FAQPage.Builder addSameAs(String value) {
			return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSchemaVersion(Text value) {
			return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
		}

		@Override
		public FAQPage.Builder addSchemaVersion(URL value) {
			return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
		}

		@Override
		public FAQPage.Builder addSchemaVersion(String value) {
			return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSignificantLink(URL value) {
			return addProperty(CoreConstants.PROPERTY_SIGNIFICANT_LINK, value);
		}

		@Override
		public FAQPage.Builder addSignificantLink(String value) {
			return addProperty(CoreConstants.PROPERTY_SIGNIFICANT_LINK, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSignificantLinks(URL value) {
			return addProperty(CoreConstants.PROPERTY_SIGNIFICANT_LINKS, value);
		}

		@Override
		public FAQPage.Builder addSignificantLinks(String value) {
			return addProperty(CoreConstants.PROPERTY_SIGNIFICANT_LINKS, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSourceOrganization(Organization value) {
			return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
		}

		@Override
		public FAQPage.Builder addSourceOrganization(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
		}

		@Override
		public FAQPage.Builder addSourceOrganization(String value) {
			return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addSpecialty(Specialty value) {
			return addProperty(CoreConstants.PROPERTY_SPECIALTY, value);
		}

		@Override
		public FAQPage.Builder addSpecialty(String value) {
			return addProperty(CoreConstants.PROPERTY_SPECIALTY, Text.of(value));
		}

		@Override
		public FAQPage.Builder addText(Text value) {
			return addProperty(CoreConstants.PROPERTY_TEXT, value);
		}

		@Override
		public FAQPage.Builder addText(String value) {
			return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
		}

		@Override
		public FAQPage.Builder addThumbnailUrl(URL value) {
			return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
		}

		@Override
		public FAQPage.Builder addThumbnailUrl(String value) {
			return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
		}

		@Override
		public FAQPage.Builder addTimeRequired(Duration value) {
			return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
		}

		@Override
		public FAQPage.Builder addTimeRequired(Duration.Builder value) {
			return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
		}

		@Override
		public FAQPage.Builder addTimeRequired(String value) {
			return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
		}

		@Override
		public FAQPage.Builder addTranslator(Organization value) {
			return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
		}

		@Override
		public FAQPage.Builder addTranslator(Organization.Builder value) {
			return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
		}

		@Override
		public FAQPage.Builder addTranslator(Person value) {
			return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
		}

		@Override
		public FAQPage.Builder addTranslator(Person.Builder value) {
			return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
		}

		@Override
		public FAQPage.Builder addTranslator(String value) {
			return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
		}

		@Override
		public FAQPage.Builder addTypicalAgeRange(Text value) {
			return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
		}

		@Override
		public FAQPage.Builder addTypicalAgeRange(String value) {
			return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addUrl(URL value) {
			return addProperty(CoreConstants.PROPERTY_URL, value);
		}

		@Override
		public FAQPage.Builder addUrl(String value) {
			return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
		}

		@Override
		public FAQPage.Builder addVersion(Number value) {
			return addProperty(CoreConstants.PROPERTY_VERSION, value);
		}

		@Override
		public FAQPage.Builder addVersion(String value) {
			return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addVideo(VideoObject value) {
			return addProperty(CoreConstants.PROPERTY_VIDEO, value);
		}

		@Override
		public FAQPage.Builder addVideo(VideoObject.Builder value) {
			return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
		}

		@Override
		public FAQPage.Builder addVideo(String value) {
			return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
		}

		@Override
		public FAQPage.Builder addWorkExample(CreativeWork value) {
			return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
		}

		@Override
		public FAQPage.Builder addWorkExample(CreativeWork.Builder value) {
			return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
		}

		@Override
		public FAQPage.Builder addWorkExample(String value) {
			return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
		}

		@Override
		public FAQPage.Builder addDetailedDescription(Article value) {
			return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
		}

		@Override
		public FAQPage.Builder addDetailedDescription(Article.Builder value) {
			return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
		}

		@Override
		public FAQPage.Builder addDetailedDescription(String value) {
			return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
		}

		@Override
		public FAQPage.Builder addPopularityScore(PopularityScoreSpecification value) {
			return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
		}

		@Override
		public FAQPage.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
			return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
		}

		@Override
		public FAQPage.Builder addPopularityScore(String value) {
			return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
		}

		@Override
		public FAQPage build() {
			return new FAQPageImpl(properties, reverseMap);
		}
	}

	public FAQPageImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
		super(properties, reverseMap);
	}

	@Override
	public String getFullTypeName() {
		return CoreConstants.TYPE_FAQ_PAGE;
	}

	@Override
	public boolean includesProperty(String property) {
		return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
				|| PROPERTY_SET.contains(GoogConstants.NAMESPACE + property) || PROPERTY_SET.contains(property);
	}
}
